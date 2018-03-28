package entities;

import entities.Angajat;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T19:22:07")
@StaticMetamodel(Departament.class)
public class Departament_ { 

    public static volatile ListAttribute<Departament, Angajat> angajati;
    public static volatile SingularAttribute<Departament, Integer> id;
    public static volatile SingularAttribute<Departament, String> nume;

}