# dagger2_sample_demp

This is sample dagger2 project in kotlin, which includes very basic demo of dagger2, how the project structure should explained in this demo.
This demo also includes following concepts
1) Component
2) Provides
3) Modules
4) Scopes
5) Qaulifiers 
6) Dependencies
Taken very good example how the Application class resolves the dependencies of networkservices(dummy remote connection class) and database services (dummy db class). Explained how the viewmodel should takes these instances of network and db and uses this instance through out the life cycle of application.
Dependencies made easy to share singleton instances of db and network 
