package br.com.jamc.coursesmanager.core.filter;

import lombok.Data;

/**
 *
 * @author joelamalio
 */
@Data
public class EducationalInstitutionFilter {
    
    private String name;
    
    private PeriodFilter periodCreatedAt;

    public EducationalInstitutionFilter() {
        this.periodCreatedAt = new PeriodFilter();
    }
    
}
