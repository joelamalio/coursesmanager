package br.com.jamc.coursesmanager.core.entity;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 *
 * @author joelamalio
 */
@StaticMetamodel(EducationalInstitution.class)
public class EducationalInstitution_ {

    public static volatile SingularAttribute<EducationalInstitution, String> name;
    
    public static volatile SingularAttribute<EducationalInstitution, Date> createdAt;
    
}
