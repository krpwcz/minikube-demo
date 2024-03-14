package at.htl.boundary;

import at.htl.entity.Vehicle;
import at.htl.repository.VehicleRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("api/vehicle")
public class VehicleResource {
    @Inject
    VehicleRepository vehicleRepository;

    @GET
    @Path("/list")
    public Response findAll() {
        List<Vehicle> vehicles = vehicleRepository.listAll();
        return Response.ok(vehicles).build();
    }
}
