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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;

// import project.absensi.absensi.model.waktu.Waktu;
 

@Entity
@Table(name="perusahaan")
public class Perusahaans  {
    
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // many to one ke cities

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_city", referencedColumnName="id", insertable = false, updatable = false)
    private Cities cities; // object kategorie, mengambil object lain

public Cities getCities() {
    return cities;
  }
public void setCities(Cities cities) {
    this.cities = cities;
}

    //setter
//id satuan
@NotBlank
private Long id_city;

public Long getIdCity() {
    return id_city;
  }
  
  public void setIdCity(Long id_city) {
    this.id_city = id_city;
  }



    // many to one ke kategory

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_kategori", referencedColumnName="id", insertable = false, updatable = false)
    private Kategories kategories; // object kategorie, mengambil object lain

public Kategories getKategories() {
    return kategories;
  }
public void setKategories(Kategories kategories) {
    this.kategories = kategories;
}

    //setter
//id kategorie
@NotBlank
private Long id_kategori;

public Long getIdKategori() {
    return id_kategori;
  }
  
  public void setIdKategori(Long id_kategori) {
    this.id_kategori = id_kategori;
  }



    // many to one ke Bidang Perusahaan


    @ManyToOne(optional=false)
    @JoinColumn(name = "id_bidang", referencedColumnName="id", insertable = false, updatable = false)
    private BidangPerusahaan bidangPerusahaan; // object kategorie, mengambil object lain

public BidangPerusahaan getBidangPerusahaan() {
    return bidangPerusahaan;
  }
public void setBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
    this.bidangPerusahaan = bidangPerusahaan;
}

    //setter
//id satuan
@NotBlank
private Long id_bidang;

public Long getIdBidang() {
    return id_bidang;
  }
  
  public void setIdBidang(Long id_bidang) {
    this.id_bidang = id_bidang;
  }







    // many to one ke Users
    

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_user", referencedColumnName="id", insertable = false, updatable = false)
    private User user; // object kategorie, mengambil object lain

public User getUser() {
    return user;
  }
public void setUser(User user) {
    this.user = user;
}

    //setter
//id satuan
@NotBlank
private Long id_user;

public Long getIdUser() {
    return id_user;
  }
  
  public void setIdUser(Long id_user) {
    this.id_user = id_user;
  }





      // nama Perusahaan

      @NotBlank
      @Size(min=3, max = 50)
      private String nama_perusahaan;
   
      public String getNamaPerusahaan(){
          return nama_perusahaan;
      }
      public void setNamaPerusahaan(String nama_perusahaan){
          this.nama_perusahaan = nama_perusahaan;
      }

   


}