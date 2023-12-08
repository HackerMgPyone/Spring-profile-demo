package org.example.formatter;


import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("Db")
public class DbReportFormatter implements ReportFormatter {
    @Override
    public Report format(Report report) {
        System.out.println(this.getClass().getSimpleName()+
                "::format(Report report)");
        return null;
    }
}