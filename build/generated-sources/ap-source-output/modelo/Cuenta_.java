package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cuenta.class)
public abstract class Cuenta_ {

	public static volatile SingularAttribute<Cuenta, String> clave;
	public static volatile SingularAttribute<Cuenta, Boolean> estado;
	public static volatile SingularAttribute<Cuenta, Persona> persona;
	public static volatile SingularAttribute<Cuenta, Date> creadoEn;
	public static volatile SingularAttribute<Cuenta, Date> modificadoEn;
	public static volatile SingularAttribute<Cuenta, String> usuario;
	public static volatile SingularAttribute<Cuenta, Long> id;

}

