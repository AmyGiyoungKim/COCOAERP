package kh.cocoa.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MessengerViewDTO {
    private int seq;
    private String type;
    private String name;
    private int party_seq;
    private int emp_code;
    //추가부분
    private String empname;
    private String deptname;
    private String teamname;
    private String posname;

    @Builder

    public MessengerViewDTO(int seq, String type, String name, int party_seq, int emp_code, String empname, String deptname, String teamname, String posname) {
        this.seq = seq;
        this.type = type;
        this.name = name;
        this.party_seq = party_seq;
        this.emp_code = emp_code;
        this.empname = empname;
        this.deptname = deptname;
        this.teamname = teamname;
        this.posname = posname;
    }
}
