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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;


@Entity
@Table (name="bidang_perusahaan")

public class BidangPerusahaan {

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
    private  String nama_bidang;

    //

    public String getNamaBidang(){
        return nama_bidang;
    }
    public void setNamaBidang (String nama_bidang ){
        this.nama_bidang=nama_bidang;
    }


}