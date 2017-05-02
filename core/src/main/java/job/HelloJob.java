package job;

import com.hand.hap.job.AbstractJob;
import com.hand.hap.mail.dto.Message;
import com.hand.hap.mail.service.IEmailService;
import com.sun.javafx.collections.MappingChange;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by admin on 2017/4/28.
 * author:lanyu
 * description:实现简单的Job接口类
 */
public class HelloJob extends AbstractJob {
    @Override
    public void safeExecute(JobExecutionContext context) throws Exception {
     System.out.println("hello world");

    }
}
