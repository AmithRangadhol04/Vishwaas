package com.vishwaas; 


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CertificatesData extends JpaRepository<CertificateData, Integer>
{

}
