
pipelineJob("pipeline-seed-review-build"){
	  definition {
            cps{
			script(readFileFromWorkspace('pipeline/Jenkinsfile-review'))
			sandbox()
		}
	}
}

