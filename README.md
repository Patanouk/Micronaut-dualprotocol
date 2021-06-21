# How to reproduce the issue?

1. Run the main class in [Application.java](src/main/java/com/example/Application.java)
2. Run a couple of curl calls

| Curl call | Result |
|-----------|--------|
|`curl -X GET localhost:8080/hello` | OK                                                            
|`curl -k -X GET https://localhost:8443/hello` | OK                                                 
|`curl -H "Content-type:application/json" -k -X POST https://localhost:8443/hello -d "hello"` | OK  
|`curl -H "Content-type:application/json" -X POST http://localhost:8080/hello -d "hello"` | Hangs


## Conclusion
Post calls to http port with http2 enabled are hanging
