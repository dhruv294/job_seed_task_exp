#!groovy
node() {
	properties([cron('H/5 * * * *')])	
		checkout scm

		jobDsl ignoreExisting: true,
			   lookupStrategy: 'SEED_JOB',
			   targets: ['jobs/release.groovy',
			   'jobs/nightly.groovy',
			   'jobs/review.groovy'].join('\n')
}
