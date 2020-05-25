#!/bin/bash
cd ..
MVN_ARG_LINE=()

for arg in "$@"
do
    case "$arg" in
        *)
            MVN_ARG_LINE+=("$arg")
        ;;
    esac
done

startDateTime=`date +%s`

# check that Maven args are non empty
if [ "$MVN_ARG_LINE" != "" ] ; then
    mvnBin="mvn"
    if [ -a $M3_HOME/bin/mvn ] ; then
       mvnBin="$M3_HOME/bin/mvn"
    fi
    echo
    echo "Running maven build on available projects (using Maven binary '$mvnBin')"

    "$mvnBin" -v
    echo
    #the line below doesn't resolve the wildcard and models and kjars are not built
    #projects=( "*-model" "*-kjar" "PHM-Processes-SB-service")
    projects=( "PHM-Processes-SB-model" "PHM-Processes-SB-kjar" "PHM-Processes-SB-service")

    for suffix in "${projects[@]}"; do

        for repository in $suffix;  do
        echo
            if [ -d "$repository" ]; then
                echo "==============================================================================="
                echo "$repository"
                echo "==============================================================================="

                cd $repository

                "$mvnBin" "${MVN_ARG_LINE[@]}"
                returnCode=$?

                if [ $returnCode != 0 ] ; then
                    exit $returnCode
                fi

                cd ..
                fi

        done;
    done;
    endDateTime=`date +%s`
    spentSeconds=`expr $endDateTime - $startDateTime`
    echo
    echo "Total build time: ${spentSeconds}s"

else
    echo "No Maven arguments skipping maven build"
        
fi


if [[ "$@" =~ "docker" ]]; then
    echo "Launching the application as docker container..."
    
    docker run -d -p 8091:8091 --name phm-processes-sb-service apps/phm-processes-sb-service:1.0
elif [[ "$@" =~ "openshift" ]]; then
    echo "Launching the application on OpenShift..."
    
    oc new-app PHM-Processes-SB-service:1.0
    oc expose svc/PHM-Processes-SB-service
else

	echo "Launching the application locally..."
	pattern="PHM-Processes-SB-service"
	files=( $pattern )
    #the line below doesn't work
	#cd ${files[0]}
    cd PHM-Processes-SB-service
	executable="$(ls  *target/*.jar | tail -n1)"
	java -jar "$executable"
fi