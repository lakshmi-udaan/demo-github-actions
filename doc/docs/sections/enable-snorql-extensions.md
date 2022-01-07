
### Enable snorql-extensions in your project (optional)

Pre-requisites: [How to integrate snorql in your project](#how-to-integrate-snorql-in-your-project)

#### Initialize `SQLCommonMetrics`

Call registerSQLMetrics() during module bootstrap of the application

```kotlin
/
 * RegisterSQLMetrics in App Startup
*/
fun registerSQLMetrics() { 
 // Initialises all the metric provided in snorql-extensions
    SQLCommonMetrics.initialize()
}
```

