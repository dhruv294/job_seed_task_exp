
pipelineJob("pipeline-seed-review-build"){
	  definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url "https://github.com/dhruv294/job_seek_task.git"
                            
                        }
                }
                scriptPath "pipeline/Jenkinsfile-review"
            }
        }
	}
}

