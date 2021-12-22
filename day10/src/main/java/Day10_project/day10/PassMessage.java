package Day10_project.day10;

import org.springframework.beans.factory.annotation.Autowired;

public class PassMessage {
@Autowired                     //injecting myMessage class in PassMessage class using autowired
myMessage msg;

public myMessage getMsg() {
	return msg;
}

public void setMsg(myMessage msg) {
	this.msg = msg;
}
void displayMsg() {
	msg.display();
}
}
