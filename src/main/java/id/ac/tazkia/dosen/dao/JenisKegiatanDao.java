package id.ac.tazkia.dosen.dao;

import id.ac.tazkia.dosen.entity.Jabatan;
import id.ac.tazkia.dosen.entity.JenisKegiatan;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by yogi on 04/05/2017.
 */
public interface JenisKegiatanDao extends PagingAndSortingRepository<JenisKegiatan, String> {
}
