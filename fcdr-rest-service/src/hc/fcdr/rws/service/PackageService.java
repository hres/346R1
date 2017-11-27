package hc.fcdr.rws.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hc.fcdr.rws.db.PackageDao;
import hc.fcdr.rws.db.PgConnectionPool;
import hc.fcdr.rws.domain.Package;
import hc.fcdr.rws.except.DaoException;
import hc.fcdr.rws.model.pkg.InsertPackageResponse;
import hc.fcdr.rws.model.pkg.PackageDataResponse;
import hc.fcdr.rws.model.pkg.PackageInsertRequest;
import hc.fcdr.rws.model.pkg.PackageRequest;
import hc.fcdr.rws.model.sales.SalesInsertDataResponse;
import hc.fcdr.rws.model.sales.SalesInsertRequest;
import hc.fcdr.rws.util.ContextManager;

@Path("/PackageService")
public class PackageService extends Application
{
    static PackageDao packageDao = null;

    @PostConstruct
    public static void initialize()
    {
        if (packageDao == null)
        {
            final PgConnectionPool pgConnectionPool = new PgConnectionPool();
            pgConnectionPool.initialize();

            try
            {
                packageDao = new PackageDao(pgConnectionPool.getConnection(),
                        ContextManager.getJndiValue("SCHEMA"));
            }
            catch (final SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    @GET
    @Path("/packageraw")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Package> getPackageRawAll()
    {
        try
        {
            if (packageDao != null)
                return packageDao.getPackage();
        }
        catch (final DaoException e)
        {
            e.printStackTrace();
        }

        return new ArrayList<Package>();
    }

    @GET
    @Path("/packageraw/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Package getPackageRaw(@PathParam("id") final long id)
    {
        try
        {
            if (packageDao != null)
                return packageDao.getPackage(id);
        }
        catch (final DaoException e)
        {
            e.printStackTrace();
        }

        return new Package();
    }

    // ==============================

    @GET
    @Path("/package")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPackage()
    {
        PackageDataResponse entity = new PackageDataResponse();

        try
        {
            if (packageDao != null)
                entity = packageDao.getPackageResponse();
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }

        return Response.status(Response.Status.OK)
                       .type(MediaType.APPLICATION_JSON)
                       .entity(entity)
                       .build();
    }

    @GET
    @Path("/package/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPackage(@PathParam("id") final long id)
    {
        PackageDataResponse entity = new PackageDataResponse();

        try
        {
            if (packageDao != null)
                entity = packageDao.getPackageResponse(id);
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }

        return Response.status(Response.Status.OK)
                       .type(MediaType.APPLICATION_JSON)
                       .entity(entity)
                       .build();
    }

    @POST
    @Path("/packagefiltered")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getPackage(final PackageRequest packageRequest)
            throws SQLException, IOException, Exception
    {
        PackageDataResponse entity = new PackageDataResponse();

        try
        {
            if (packageDao != null)
                entity = packageDao.getPackageResponse(packageRequest);
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }

        return Response.status(Response.Status.OK)
                       .type(MediaType.APPLICATION_JSON)
                       .entity(entity)
                       .build();
    }
    @POST
    @Path("/insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(final PackageInsertRequest packageInsertRequest)
            throws SQLException, IOException, Exception
    {
        InsertPackageResponse entity = new InsertPackageResponse();
        try
        {
            if (packageDao != null)
                entity = packageDao.getPackageInsertResponse(packageInsertRequest);
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }

        return Response.status(Response.Status.OK)
                       .type(MediaType.APPLICATION_JSON)
                       .entity(entity)
                       .build();
    }

    // ===
    @OPTIONS
    @Path("/package")
    @Produces(MediaType.APPLICATION_XML)
    public String getSupportedOperations()
    {
        return "<operations>GET, PUT, POST, DELETE</operations>";
    }
}
