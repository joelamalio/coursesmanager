package br.com.jamc.coursesmanager.core.repository.specification.util;

import java.util.Date;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author jadossantos
 */
public class SpecificationUtil<T> {

    public Predicate ignoreCaseContaining(Root<T> root, CriteriaBuilder builder, SingularAttribute<T, String> attribute, String text) {
        return builder.like(builder.lower(root.get(attribute)), "%" + text.toLowerCase() + "%");
    }

    public Predicate lessThanOrEqualTo(Root<T> root, CriteriaBuilder builder, SingularAttribute<T, Date> attribute, Date date) {
        return builder.lessThanOrEqualTo(root.get(attribute), date);
    }

    public Predicate greaterThanOrEqualTo(Root<T> root, CriteriaBuilder builder, SingularAttribute<T, Date> attribute, Date date) {
        return builder.greaterThanOrEqualTo(root.get(attribute), date);
    }
}
