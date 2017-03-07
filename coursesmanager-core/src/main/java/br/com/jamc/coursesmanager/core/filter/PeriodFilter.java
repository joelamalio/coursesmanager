package br.com.jamc.coursesmanager.core.filter;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author joelamalio
 */
@Data
public class PeriodFilter {

    private Date initial;
    
    private Date end;
}
