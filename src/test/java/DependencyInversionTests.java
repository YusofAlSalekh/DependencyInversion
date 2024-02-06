import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class DependencyInversionTests {

    @Test
    public void classesInClassesPackageShouldOnlyDependOnMyInterface() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("Classes");

        ArchRule rule = classes().that().resideInAPackage("Classes")
                .should().onlyDependOnClassesThat()
                .resideInAnyPackage("java..", "..Implementations..")
                .andShould().onlyDependOnClassesThat().areInterfaces();

        rule.check(importedClasses);
    }
}

