package e_commerceFullStack.e_commerceFullStack.model;

import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

@Data
public class Electronics {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private String brand;
    private Specification specification;
    private Integer stock;

    private class Specification{
        private String screensize;
        private String battery;
        private String processor;
        private String ROM;
    }
}
