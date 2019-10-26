package pl.trzos.bdg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Setter
@Getter
@Entity
public class BudgetVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private ArrayList<BdgEntry> entries;

}
