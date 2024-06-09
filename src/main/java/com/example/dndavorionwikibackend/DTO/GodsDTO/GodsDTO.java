package com.example.dndavorionwikibackend.DTO.GodsDTO;

public class GodsDTO {

    private Long godsId;

    private String godsName;

    private String godsDescription;

    private String godsDomain;

    private String godLevel;

    public Long getGodsId() {
        return godsId;
    }

    public void setGodsId(Long godsId) {
        this.godsId = godsId;
    }

    public String getGodsName() {
        return godsName;
    }

    public void setGodsName(String godsName) {
        this.godsName = godsName;
    }

    public String getGodsDescription() {
        return godsDescription;
    }

    public void setGodsDescription(String godsDescription) {
        this.godsDescription = godsDescription;
    }

    public String getGodsDomain() {
        return godsDomain;
    }

    public void setGodsDomain(String godsDomain) {
        this.godsDomain = godsDomain;
    }

    public String getGodLevel() {
        return godLevel;
    }

    public void setGodLevel(String godLevel) {
        this.godLevel = godLevel;
    }
}
