package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	
	// Brand findByName(String name); // spring jpa keywords
	// List<Brand> findByName(String name)
	boolean existsByName(String name);
}
