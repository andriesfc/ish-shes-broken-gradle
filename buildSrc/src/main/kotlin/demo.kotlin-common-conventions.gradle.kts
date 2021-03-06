
plugins {
    id("org.jetbrains.kotlin.jvm").version("1.4.31") // <1>
}

repositories.mavenCentral()

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.9") // <3>
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }

    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) // <4>
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // <5>
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) // <6>
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2") // <7>
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine") // <8>
}

tasks.test {
    useJUnitPlatform() // <9>
}
