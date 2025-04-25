package com.marcomnrq.ecommerce.domain.model;

import java.util.List;
import javax.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.NaturalId;

@Data
@Entity
@Table(name = "categories")
public class Category extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NaturalId
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "categories")
    @JsonIgnore
    private List<Product> products;

    private Boolean enabled;
}
