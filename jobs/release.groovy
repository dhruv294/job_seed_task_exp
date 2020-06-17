
pipelineJob("pipeline-seed-release-build"){
	  definition {
            cps{
			script(readFileFromWorkspace('pipeline/Jenkinsfile-release'))
			sandbox()
		}
	}
}
