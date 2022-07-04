package com.belajar.mahasiswa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
  import com.belajar.mahasiswa.entity.Mahasiswa;

  public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, String> {
  }