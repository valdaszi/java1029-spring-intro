package lt.bit.java2.controllers;

import lt.bit.java2.services.ResponseService;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
class AppErrorController implements ErrorController {

	private static final String ERROR_PATH = "/error";

	private final ResponseService responseService;

	AppErrorController(ResponseService responseService) {
		this.responseService = responseService;
	}


	@RequestMapping(ERROR_PATH)
    Map<String, Object> error() {
//		Map<String, Object> result = new HashMap<>();
//		result.put("success", false);
//		result.put("message", "Kazkas atsitiko :(");
		return responseService.error("Kazkas atsitiko :(");
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}
