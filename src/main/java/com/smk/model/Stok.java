package com.smk.model;

public class Stok {
    private int id;
    private String kodeBarang;
    private int stokBarang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "Stok{" +
                "id=" + id +
                ", kodeBarang='" + kodeBarang + '\'' +
                ", stokBarang=" + stokBarang +
                '}';
    }
}
