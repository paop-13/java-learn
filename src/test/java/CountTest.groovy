package learn;

import spock.lang.Specification

class CountTest extends Specification{
    def test() {
        def count = new Count()

        expect:
        count.getCount() == 0
        count.getCount() == 1
        count.getCount() == 2
    }
}