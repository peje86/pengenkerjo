// package project.stockbarang.stockbarang.controller;

// import java.util.HashSet;
// import java.util.Set;
// import java.util.List;
 
// import javax.validation.Valid;
 
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.security.access.prepost.PreAuthorize;

// import project.stockbarang.stockbarang.model.Role;
// import project.stockbarang.stockbarang.model.Products;
// import project.stockbarang.stockbarang.model.RoleName;
// import project.stockbarang.stockbarang.model.User;
// import project.stockbarang.stockbarang.repository.RoleRepository;
// import project.stockbarang.stockbarang.repository.UserRepository;
// import project.stockbarang.stockbarang.repository.ProductRepository;
// import project.stockbarang.stockbarang.security.jwt.JwtProvider;


 
// @CrossOrigin(origins = "*", maxAge = 3600)
// @RestController
// @RequestMapping("/api/auth")
// public class ProductController {
 
//     @Autowired
//     AuthenticationManager authenticationManager;
 
//     @Autowired
//     UserRepository userRepository;
 
//     @Autowired
//     RoleRepository roleRepository;
 
//     @Autowired
//     ProductRepository productRepository;
    
//     @Autowired
//     PasswordEncoder encoder;
 
//     @Autowired
//     JwtProvider jwtProvider;
 
//     // 1.  memanggil semua product
  
// @GetMapping("tampilallproduct")//memanggil method tampil data
// @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")

// public @ResponseBody List<Products> getAllProducts() {  //products diambil dari tabel nama class di model
//     return productRepository.findAll();
//  }

// }