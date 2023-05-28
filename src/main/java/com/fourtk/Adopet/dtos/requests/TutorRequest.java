package com.fourtk.Adopet.dtos.requests;

import com.fourtk.Adopet.entities.Tutor;
import com.fourtk.Adopet.services.validation.CpfValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@CpfValid
public class TutorRequest {
    private Long id;
    @NotBlank(message = "Required field")
    @Size(min = 5, max = 50, message = "Required field")
    private String name;
    @Email
    @NotBlank(message = "Required field")
    private String email;
    @NotBlank(message = "Required field")
    private String password;
    @NotBlank(message = "Required field")
    private String cpf;
    @NotBlank(message = "Required field")
    private String address;
    @NotBlank(message = "Required field")
    private String city;
    @NotBlank(message = "Required field")
    private String uf;
    @NotBlank(message = "Required field")
    private String phone;
    private String image;

    public TutorRequest() {
    }

    public TutorRequest(Long id,
                        String name,
                        String email,
                        String password,
                        String cpf,
                        String address,
                        String city,
                        String uf,
                        String phone,
                        String image) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;
        this.city = city;
        this.uf = uf;
        this.phone = phone;
        this.image = image;
    }

    public TutorRequest(Tutor entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.cpf = entity.getCpf();
        this.address = entity.getAddress();
        this.city = entity.getCity();
        this.uf = entity.getUf();
        this.phone = entity.getPhone();
        this.image = entity.getImage();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "TutorRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cpf='" + cpf + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", uf='" + uf + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}


