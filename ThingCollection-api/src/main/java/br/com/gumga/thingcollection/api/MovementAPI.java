package br.com.gumga.thingcollection.api;

import br.com.gumga.thingcollection.application.service.MovementService;
import br.com.gumga.thingcollection.domain.model.Movement;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMethod;
import gumga.framework.presentation.RestResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.BindingResult;
import gumga.framework.application.GumgaTempFileService;
import gumga.framework.domain.domains.GumgaImage;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/movement")
public class MovementAPI extends GumgaAPI<Movement, Long> {


    @Autowired
    public MovementAPI(GumgaService<Movement, Long> service) {
        super(service);
    }


}
