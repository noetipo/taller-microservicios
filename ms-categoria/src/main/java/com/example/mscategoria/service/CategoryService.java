package com.example.mscategoria.service;

import com.example.mscategoria.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Categoria> listar();

    public Categoria guardar(Categoria categoria);

    public Categoria actualizar(Categoria categoria);

    public Optional<Categoria> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
