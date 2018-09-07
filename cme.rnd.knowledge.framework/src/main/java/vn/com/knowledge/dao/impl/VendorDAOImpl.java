package vn.com.knowledge.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vn.com.knowledge.dao.VendorDAO;
import vn.com.knowledge.entity.VendorEntity;
import vn.com.knowledge.repository.VendorRepository;

@Repository("vendorDAO")
@Transactional(readOnly = true)
public class VendorDAOImpl implements VendorDAO {

	@Autowired
	private VendorRepository vendorRepository;

	@Override
	@Transactional
	public VendorEntity addOrUpdate(VendorEntity entity) {
		return vendorRepository.saveAndFlush(entity);
	}

	@Override
	public Optional<VendorEntity> findById(Long id) {
		return vendorRepository.findById(id);
	}

	@Override
	public List<VendorEntity> findAll() {
		return vendorRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}
	@Override
	@Transactional
	public void add(VendorEntity categoryEntity) {

		vendorRepository.saveAndFlush(categoryEntity);
	}

	@Override
	public Optional<VendorEntity> findByNameLike(String name) {

		return vendorRepository.findByNameLike(name);
	}

}
