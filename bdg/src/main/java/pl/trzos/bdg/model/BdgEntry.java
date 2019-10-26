package pl.trzos.bdg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class BdgEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal value;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    @ManyToOne
    private CostCenter costCenter;


}
