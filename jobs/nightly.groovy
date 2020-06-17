pipelineJob("pipeline-seed-nightly-build"){
	definition {
		cps{
			script(readFileFromWorkspace('pipeline/Jenkinsfile-nightly'))
		}
					
		
		/*
		cpsScm {
			scm {
				git {
					remote {
						url "https://github.com/dhruv294/job_seek_task.git"

					}
				}
				scriptPath "pipeline/Jenkinsfile-nightly"
			}
		}*/
	}
}

