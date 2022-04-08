package zhao.lhcmo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zhao.lhcmo.dao.IType;
import zhao.lhcmo.pojo.Type;
import zhao.lhcmo.service.ITypeService;

@Service
public class TypeServiceImpl extends ServiceImpl<IType, Type> implements ITypeService {
}
