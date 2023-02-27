package arquitectura.software.demo.CurrencyRepository

import org.springframework.data.repository.CrudRepository
import java.util.Currency

interface CurrencyRepository: CrudRepository<Currency, Long>