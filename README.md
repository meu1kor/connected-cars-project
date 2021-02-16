# connected-cars-project
It has the architecture doc and the code

The folder structure


├── docs                    # Documentation files (alternatively `doc`)
├── src                     # Source files
├── .gitignore              # mentioned with filenames or folder to be ignored
├── Dockerfile              # required to build the docker image
├── pom.xml                 # dependencies for the project is present here.
└── README.md

Source files
The actual source files of a software project are usually stored inside the src folder.

Samples: DataLoggingController.java etc.

Documentation 
Here i have placed the architecture document

This document states the architecture for the use case , It can have many addon features but in a short span i could figure out only these things.
To Give a brief about the addons we can include jenkins plugin inide the eclipse project itself also this can be integrated with sonar qube to have code quality check.

i have kept few things open as that will purely depend on the use case as a whole.

To run the docker steps to be followed as i couldn't upload the image and it was mentioned that we need to send the things in a mail or github otherwise i could have uploaded the image in docker hub itself.
Steps are : 
1. Clone the project from git
2. Build in your local environment
3. Give a docker build cmd i.e.
    docker build -t <image-name> .
  
  where image name depends on the user
4. Give a docker run command
    docker run -itd -p 8080:8080 <image-name>
  
  
