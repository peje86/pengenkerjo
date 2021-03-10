package project.loker.loker.model;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;


@Entity
@Table (name="loker")

public class Lokers {

    // id 
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    // setter getter
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id =id;
    }


    // nama
    @NotBlank
    @Size(min=3, max = 50)
    private  String isi_loker;

    //

    public String getIsiLoker(){
        return isi_loker;
    }
    public void setIsiLoker (String isi_loker ){
        this.isi_loker=isi_loker;
    }





    // many to one ke Users
    

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_perusahaans", referencedColumnName="id", insertable = false, updatable = false)
    private Perusahaans perusahaans; // object kategorie, mengambil object lain

public Perusahaans getPerusahaans() {
    return perusahaans;
  }
public void setPerusahaans(Perusahaans perusahaans) {
    this.perusahaans = perusahaans;
}

    //setter
//id satuan
@NotBlank
private Long id_perusahaans;

public Long getIdPerusahaans() {
    return id_perusahaans;
  }
  
  public void setIdPerusahaans(Long id_perusahaans) {
    this.id_perusahaans = id_perusahaans;
  }





}