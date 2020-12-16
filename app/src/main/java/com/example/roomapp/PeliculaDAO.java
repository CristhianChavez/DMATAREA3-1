package com.example.roomapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PeliculaDAO {
    @Query("SELECT * FROM Pelicula")
    public List<Pelicula> peliculasTodas();

    @Insert
    public void InsertarPelicula(Pelicula ... peliculas);

    @Update
    public void ActualizarPelicula(Pelicula ... peliculas);

    @Delete
    public void BorrarPelicula(Pelicula ... peliculas);
}
