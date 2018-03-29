package space.qmen.lot.dao;

import org.apache.ibatis.annotations.Param;
import space.qmen.lot.entity.Bill;

import java.util.List;

public interface BillDao {
    List<Bill> listBill();
    Bill getBillById(@Param("id") Long id);
    Long deleteBill(Long id);

    Long saveBill(Bill bill);
    Long updateBill(Bill bill);
}
