# architectury-template-kotlin-dsl
architectury template with kotlin-dsl

Based on [Architectury-templates(1.18.2-forge-fabric-quilt-mixin)](https://github.com/architectury/architectury-templates/releases)

> **Warning**
>
> Still have some problems.

Like this.
```kotlin
val developmentFabric: Configuration by configurations.creating { extendsFrom(configurations["common"]) }
```
It will cause CONFIGURE FAILED.
```shell
FAILURE: Build failed with an exception.

* Where:
Build file 'E:\architectury-template-kotlin-dsl\fabric\build.gradle.kts' line: 23

* What went wrong:
Cannot add a configuration with name 'developmentFabric' as a configuration with that name already exists.

* Try:
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Exception is:
org.gradle.api.InvalidUserDataException: Cannot add a configuration with name 'developmentFabric' as a configuration with that name already exists.
	at org.gradle.api.internal.DefaultNamedDomainObjectCollection.assertCanAdd(DefaultNamedDomainObjectCollection.java:213)
	at org.gradle.api.internal.AbstractNamedDomainObjectContainer.create(AbstractNamedDomainObjectContainer.java:77)
	at org.gradle.api.internal.AbstractValidatingNamedDomainObjectContainer.create(AbstractValidatingNamedDomainObjectContainer.java:47)
	at org.gradle.kotlin.dsl.NamedDomainObjectContainerCreatingDelegateProvider.provideDelegate(NamedDomainObjectContainerExtensions.kt:354)
	at Build_gradle.<init>(build.gradle.kts:23)
	......


* Get more help at https://help.gradle.org

CONFIGURE FAILED in 5s
```

If you know why, please open a issues or PR to help me fix bugs.