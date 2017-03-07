package br.com.jamc.coursesmanager.core.repository.specification;

import br.com.jamc.coursesmanager.core.repository.specification.util.SpecificationUtil;
import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;
import br.com.jamc.coursesmanager.core.entity.EducationalInstitution_;
import br.com.jamc.coursesmanager.core.filter.EducationalInstitutionFilter;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

/**
 *
 * @author jadossantos
 */
public class EducationalInstitutionSpecification {
    
    private static final SpecificationUtil<EducationalInstitution> UTIL = new SpecificationUtil<EducationalInstitution>();

    public static Specification<EducationalInstitution> findByFilter(EducationalInstitutionFilter filter) {
        return new Specification<EducationalInstitution>() {
            @Override
            public Predicate toPredicate(Root<EducationalInstitution> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
                final Collection<Predicate> predicates = new ArrayList<>();

                if (!StringUtils.isEmpty(filter.getName())) {
                    predicates.add(UTIL.ignoreCaseContaining(root, builder, EducationalInstitution_.name, filter.getName()));
                }

                if (filter.getPeriodCreatedAt().getInitial() != null) {
                    predicates.add(UTIL.greaterThanOrEqualTo(root, builder, EducationalInstitution_.createdAt, filter.getPeriodCreatedAt().getInitial()));
                }

                if (filter.getPeriodCreatedAt().getEnd() != null) {
                    predicates.add(UTIL.lessThanOrEqualTo(root, builder, EducationalInstitution_.createdAt, filter.getPeriodCreatedAt().getEnd()));
                }

                return builder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }

}
