package com.cry.luckytoyou.entities;

import javax.persistence.*;

/**
 * @author fys
 * @date 2022/6/18
 * @description
 */
@Entity
public class Prize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "prize_name")
    private String prizeName;
    @Column(name = "prize_pic")
    private String prizePic;
    private double rage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizePic() {
        return prizePic;
    }

    public void setPrizePic(String prizePic) {
        this.prizePic = prizePic;
    }

    public double getRage() {
        return rage;
    }

    public void setRage(double rage) {
        this.rage = rage;
    }
}
