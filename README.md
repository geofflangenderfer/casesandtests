# State Coronavirus testing
It's vital that states get to a point where people are comfortable going back to work without fear of infecting anyone with coronavirus. We should be confident when a states daily testing totals matches it's working population total. My aim is to answer:
- how many tests is my state doing?
- how close is my state to matching working population total to daily testing capacity?

## How to reproduce results
In your terminal:

```
geoff@DESKTOP-DSQFUUU:~/work/springProjects/casesandtests$ ./gradlew bootRun
...
StateTests{positiveScore = 0, negativeScore = 0, negativeRegularScore = 0, commercialScore = 0, grade = null, score = 0, negative = 126, pending = 24, hospitalized = 0, death = 0, total = 180, lastUpdateEt = 3/31 17:00, checkTimeEt = 3/31 23:40, dateModified = 2020-03-31T21:00:00Z, dateChecked = 2020-04-01T03:40:00Z, notes = Please stop using the "total" field. Use "totalTestResults" instead., positive = 30, state = VI, totalTestResults = 156, population = 0}
...
```
