package pojo;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;

public class Goods2 {
    @NotBlank(message = "{goods.name.required}")
    private String name;
    @NotBlank(message = "{goods.description.required}")
    private String description;
    @Range(min = 0, max = 100, message = "{price.invalid}")
    private double price;
    @Past(message = "{date.invalid}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
