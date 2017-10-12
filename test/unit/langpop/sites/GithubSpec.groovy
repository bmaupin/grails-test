package langpop.sites

import spock.lang.Specification

class GithubSpec extends Specification {
    def github = new langpop.sites.Github()

    void "Test getScore"() {
        when:"A valid date is provided"
            def score = github.getScore('javascript', Date.parse('yyyy-MM-dd', '2017-01-01'))

        then:"A valid score is returned"
            score > 1000000

        when:"An invalid date is provided"
            score = github.getScore('javascript', Date.parse('yyyy-MM-dd', '2007-01-01'))

        then:"Null is returned"
            score == null

        // TODO: implement this once we've defined behaviour for invalid languages
        // when:"An invalid language is provided"
        //     score = github.getScore('notalanguage', Date.parse('yyyy-MM-dd', '2017-01-01'))

        // then:"Null is returned"
        //     score == null
    }
}
